# LevenshteinAlgorithmAndroid
Implementation of Levenshtein Algorithm

1. Implement a Levenshtein method returning 
the distance between token 1 and token 2. Implement the algorithm w/o allocating the full matrix, but an optimized version, which allocates only one column
at a time.

2. Use this test-case:

Haus, Maus => 1

Haus, Mausi => 2

Haus, Häuser => 3

Kartoffelsalat, Runkelrüben => 12

3. Implement a modified version which makes an early exit if the distance exceeds a maximum distance. Return maxDist + 1 in this case.

4. Use the same test-case (yields different output now):

Haus, Maus, 2 => 1

Haus, Mausi, 2 => 2

Haus, Häuser, 2 => 3

Kartoffelsalat, Runkelrüben, 2 => 3

5. Implement a performance measurement on all test-cases and both
variants of implementation.
