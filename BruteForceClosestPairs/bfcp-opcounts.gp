set term pdf
set output "bfcp-opcounts.pdf"
set title "Brute Force Convex Hull Operation Counts"
set xlabel "Problem Size (n)"
set ylabel "Number of Distance Calculations"
plot \
  'fastest-1.0.dat' using 2:5 title "range=1" with linesp,\
  'fastest-8.0.dat' using 2:5 title "range=8" with linesp,\
  'fastest-64.0.dat' using 2:5 title "range=64" with linesp

