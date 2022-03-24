package week5.day1;

public class AxisBank extends BankInfo {
public void deposit()
{
	System.out.println("total deposit:230lakhs");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank axis=new AxisBank();
BankInfo bank=new BankInfo();
axis.deposit();
axis.fixed();
axis.saving();
bank.deposit();

	}

}
