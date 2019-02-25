set term pdf
set output "bfcp-times.pdf"
set title "Brute Force Convex Hull Run Times"
set xlabel "Problem Size (n)"
set ylabel "Time in milliseconds"
plot \
  'fastest-1.0.dat' using 2:4 title "range=1" with linesp,\
  'fastest-8.0.dat' using 2:4 title "range=8" with linesp,\
  'fastest-64.0.dat' using 2:4 title "range=64" with linesp

