package HOME_WORK.DZ3.P1.N7;




public class TriangleChecker {
    public static Boolean check(double a, double b, double c)
    {
        if (a + b >= c) {
            if (b + c >= a)
                if (c + a >= b)
                    return true;
        }
        else {
            return false;
        }

        return null;
    }
}

