package atm;


public class Handler_price extends Handler{
    public Handler_price(int hnd_pr, Handler next) {
        super(hnd_pr, next);
    }

    @Override
    public void process(int price) {
        System.out.println(price/hnd_pr + " * " + hnd_pr );
        if (price%hnd_pr != 0){
            if (getNext() == null){
                throw new ArithmeticException("There is some" + price%hnd_pr + "left and we cant change them");
            }
            getNext().process(price%hnd_pr);
        }

    }
}