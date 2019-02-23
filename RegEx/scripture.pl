#!/usr/bin/perl
if  (not defined $ARGV[0]) {
  die "need filename\n";
  exit(0);
}

my $filename = $ARGV[0];

open(my $fh, '<:encoding(UTF-8)', $filename)
  or die "Could not open file '$filename' $!";

while (my $row = <$fh>) {
  chomp $row;
  if ($row eq "") {
    next;
  }
  print "$row";


  # match book
  $book_p = qr/^\d*\s*[[:alpha:]]+/;
  my $match = ($row =~ m/$book_p/);
  if (not $match) {
    print "\t\t---- missing book\n";
    next;
  }
 $row = $';

  # remove all whitespace
  $row =~ s/\s+//g;
  
  # match ref
  my $verse_p = qr/\d+(--?\d+)?/;
  my $verselist_p = qr/$verse_p(,$verse_p)*/;
  my $vaddr_p = qr/\d+:\d+/;
  my $addr_p = qr/($vaddr_p--?$vaddr_p)|(\d(:$verselist_p)?)/;
  my $ref_p = qr/$addr_p(;$addr_p)*/;
  $match = ($row =~ m/$ref_p/);
  $row = $';

  # match trans
  my $trans_p = qr/\([[:alpha:]]+\)/;
  $match = ($row =~ m/$$trans_p/);

  $row = $';
  if ($row ne "") {
    print "\t\t---- unmatched: $row\n";
    next;
  }
  print "\t\t---- good\n";
}