class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = 1L * length * width * height;

        boolean bulky = length >= 10000 || width >= 10000 ||
                        height >= 10000 || volume >= 1_000_000_000L;

        boolean heavy = mass >= 100;

        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }
}