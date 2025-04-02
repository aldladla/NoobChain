public class HashCalculator {
    public static String calculateHash(String previousHash, long timeStamp, String data) {
        return StringUtil.applySha256(
                previousHash +
                        Long.toString(timeStamp) +
                        data
        );
    }
}
