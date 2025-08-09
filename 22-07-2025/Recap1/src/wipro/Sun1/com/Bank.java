package wipro.Sun1.com;
public class Bank 
{
String accno,bname;
float balance;
public Bank(String accno, String bname, float balance) {
	this.accno = accno;
	this.bname = bname;
	this.balance = balance;
}
@Override
public String toString() {
	return "Bank [accno=" + accno + ", bname=" + bname + ", balance=" + balance + "]";
}
}