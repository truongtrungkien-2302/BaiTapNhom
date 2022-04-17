import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TravelingStaff extends Employee {
    private String strRegistrationDate; //ngày đăng ký
    private String strDayToGo; //ngày đi

    Date registrationDate = null;
    Date dayToGo = null;
    Calendar registrationDateCal = Calendar.getInstance();
    Calendar dayToGoCal = Calendar.getInstance();

    public boolean checkDate(String checkDate) throws ParseException {
        Date dateIn = new SimpleDateFormat("dd/MM/yyyy").parse(checkDate);
        if (dateIn.compareTo(dayToGo) <= 0)
            return true;
        return false;
    }

    @Override
    public void inputEmployee() {
        super.inputEmployee();

    }
}
