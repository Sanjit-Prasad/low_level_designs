package StatePattern.VendingStates;

public interface State {

    public void pressInsertCoinButton();

    public void insertCoin();

    public void pressProductSelectionButton();

    public void productSelection();

    public void getChange();

    public void dispenseProduct();

    public void cancelOrRefund();

    public void updateInventory();
}
