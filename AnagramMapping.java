class AnagramMapping {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            for (int j = 0; j < B.length; j++) {
                if (B[j] == element) {
                    result[i] = j;
                }
            }
        }
        return result;
    }
}