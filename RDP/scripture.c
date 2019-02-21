#include "tokens.h"
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define SHOW_ERRORS 0

char line[256];
char *cursor;

char lookahead;
char value[32];

char error = 0;

char nextChar() {
    return *cursor++;
}

void ungetChar() {
    cursor--;
}

int next() {
    int t;
    int ctr = 0;
    t = nextChar();
    // if (t != EOF && t != 0 && t != "\n" && t != "\r") {
    if (t >= 32) {
        // printf(" ok:%d ", t);
        while(t == ' ' || t == '\t') t = nextChar();
        if(isalpha(t)) {
            // have N - get rest
            value[ctr++] = t;
            t = nextChar();
            while(isalpha(t)) {
                    value[ctr++] = t;
                    t = nextChar();
                }
                value[ctr]='\0';
            ungetChar();
            return N;
        }
        if(isdigit(t)) {
            value[ctr++] = t;
            t = nextChar();
            while(isdigit(t)) {
                value[ctr++] = t;
                t = nextChar();
            }
            value[ctr] = '\0';
            ungetChar();
            return D;
        }
        if (t==';' || t==':' || t==',' || t=='(' || t==')') return t;
        if (t == '-') { //reads '--' but returns '-'
            value[ctr++] = t;
            t = nextChar();
            if (t != '-') {
                ungetChar();
                return ERR;
            }
            value[ctr++] = t;
            value[ctr] = '\0';
            return '-';
        }
        return ERR;
    }
    else {
        // printf(" eof:%d ", t);
        return EOF;
    }
}

// make sure the current character is c, then advance to next
void match(char c) {
    if (lookahead == c) lookahead = next();
    else {
        if (SHOW_ERRORS) {
            if (c == N) {
                printf("\tError: name expected, '%c' found\n", lookahead);
            } 
            else if (c == D) {
                printf("\tError: number expected, '%c' found\n", lookahead);
            }  
            else if (c == EOF) {
                printf("\tError: EOF expected, '%c' found\n", lookahead);
            } 
            else {
                printf("\tError: '%c' expected, '%c' found\n", c, lookahead);
            }
        }
        error = 1;
    }
}

parse_scripture() {
    parse_book();
    parse_reference();
    parse_translation();
    match(EOF);
}

parse_book() {
    parse_ordinal();
    parse_name();
}

parse_ordinal() {
    if (lookahead == D) {
        match(D);
    }
    // or epsilon
}

parse_name() {
    match(N);
}

parse_reference() {
    if (lookahead == D) {
        parse_addr();
        if (lookahead == ';') {
            match(';');
            parse_reference();
        }
    }
    //or epsilon
}

parse_addr() {
    parse_chapter();
    if (lookahead == ':') {
        match(':');
        parse_verselist();
    }
}

parse_chapter() {
    match(D);
}

parse_verselist() {
    parse_verse();
    if (lookahead == ',') {
        match(',');
        parse_verselist();
    }
}

parse_verse() {
    match(D);
    if (lookahead == '-') {
        match('-');
        match(D);
    }
}

parse_translation() {
    if (lookahead == '(') {
        match('(');
        match(N);
        match(')');
    }
    // or epsilon
}


int main(int argc, char *argv[]) {
    printf("scripture program:\n");
    if (argc < 2) {
        printf("need argument\n");
        exit(0);
    }
    char *filename = argv[1];
    
    FILE* file = fopen(filename, "r");
    while (fgets(line, sizeof(line), file)) {
        cursor = line;
        lookahead = next();
        if (lookahead == EOF) continue;
        error = 0;
        parse_scripture();
        strtok(line, "\r\n");
        printf("line: %s", line);
        if (error == 0) printf(" ---- good!\n");
        else printf(" ---- invalid!\n");
        /*
        lookahead = 1;
        while (lookahead != EOF) {
            lookahead = next();
            if(lookahead == D) printf("D{%s}",value);
            else if(lookahead == N) printf("N{%s}",value);
            else if(lookahead == ERR) printf("*ERR*");
            else printf("%c", lookahead);
        }
        */
    }
    fclose(file);
    printf("\nBye!\n");
}