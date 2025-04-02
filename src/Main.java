public class Main {
    public static void main(String[] args) {
Block genesisBlock = new Block("Im first block", "PreviousHash" );
        System.out.println("Hash for block 1 : " + genesisBlock.getHash() +" time stamp : "+  genesisBlock.getTimeStamp());

        Block secondBlock = new Block("Yo im the second block",genesisBlock.getHash());
        System.out.println("Hash for block 2 : " + secondBlock.getHash() + " time stamp : "+  secondBlock.getTimeStamp());
    }
}