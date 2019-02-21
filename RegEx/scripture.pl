#!/usr/bin/perl
use strict;
use warnings;
 
# Print a message.
if (not defined $ARGV[0]) {
    die "need filename\n";
    exit 0;
}

my $filename = $ARGV[0];

open(my $fh, '<:encoding(UTF-8)', $filename)
  or die "Could not open file '$filename' $!";

while (my $row = <$fh>) {
  chomp $row;
  my $copy = "abcdefghijkl". $row . "end";
  print ($copy, "\n");
}
  # print "$row" . " ---good\n";

  # my $test = $row;

  # if ($test =~ /1/) {
  #   printf("%s --- good\n", $row);
  # } else {
  #   print "$row" . " --- invalid\n";
  # }
}

