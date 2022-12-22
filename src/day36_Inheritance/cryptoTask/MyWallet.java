package day36_Inheritance.cryptoTask;

public class MyWallet {

    public static void main(String[] args) {

        Doge doge = new Doge();
        doge.setInfo(75, 5, 34564564, 234234, true);

        XRP xrp = new XRP();
        xrp.setInfo(25, 3, 2342342,234234234,false);

        Ethereum ethereum = new Ethereum();
        ethereum.setInfo(750, 2, 89347348,324234234,true);

        Cardano cardano = new Cardano();
        cardano.setInfo(220, 2, 984578,23534534,false);

        Bitcoin bitcoin = new Bitcoin();
        bitcoin.setInfo(1200, 1, 345345,345345,true);

        double totalAsset = bitcoin.totalPrice() + ethereum.totalPrice() + xrp.totalPrice() + cardano.totalPrice()
                + doge.totalPrice();


        System.out.println("totalAsset = " + totalAsset); // totalAsset = 3590.0


    }
}
