# bash script to generate statistics for the empirical study
#
# run with
#
# bash generate_timings.sh > timings.dat
#
# where "timings.dat" is the file you wish to fill with the stats
#

# run for each problem size from 2^10 to 2^19
# and each of 3 size ranges (which should not affect results)
# and do each 5 times
size="1024"
while [ $size -lt 1048576 ]; do
    for range in 1 8 64; do
	for run in 1 2 3 4 5; do
	    java BruteForceClosestPairs $size $range
	done
    done
    size=$[$size * 2]
done
