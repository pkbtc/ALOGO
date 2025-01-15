class Solution {
    public int minimizeXor(int num1, int num2) {
        int setBits = Integer.bitCount(num2);
        int bit = 31;
        int res = 0;

        // Set bits in res where num1 already has bits set
        while (bit >= 0 && setBits > 0) {
            if ((num1 & (1 << bit)) != 0) {
                res = res | (1 << bit);
                setBits--;
            }
            bit--;
        }

        // Set remaining bits in res starting from the LSB
        bit = 0;
        while (setBits > 0) {
            if ((res & (1 << bit)) == 0) {  // Check if the bit in res is unset
                res = res | (1 << bit);
                setBits--;
            }
            bit++;
        }

        return res;
    }
}
