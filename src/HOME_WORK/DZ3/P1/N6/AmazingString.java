package HOME_WORK.DZ3.P1.N6;

public class AmazingString {
    private char[] stroka;

    public AmazingString(char[] chars) {
        stroka = chars;
    }

    public AmazingString(String s) {
        stroka = s.toCharArray();
    }

    public char iel(int i) {
        return stroka[i];
    }

    public int dlina() {
        return stroka.length;
    }

    public void vivod() {
        for (int i = 0; i < stroka.length; i++) {
            System.out.print(stroka[i] + " ");
        }
    }

    public Boolean proverka(char[] n) {
        Boolean kek = false;
        for (int i = 0; i < stroka.length; i++) {
            if (stroka[i] == n[i]) {
                kek = true;
                for (int j = i + 1; j < stroka.length; j++) {
                    if (stroka[i] == n[i]) {
                        kek = true;

                    } else {
                        kek = false;
                        break;
                    }
                }
                if (kek == true)
                {
                    break;
                }
            }
        }

        return kek;

    }
    // в условии было написано что нельзя перводить массив char в String
    //НО!!!!! не было написано что нельзя переводить String в массив чаров)))))))))0
    public Boolean proverka(String s) {

        Boolean kek = false;
        char[] n = s.toCharArray();
        for (int i = 0; i < stroka.length; i++) {
            if (stroka[i] == n[i]) {
                kek = true;
                for (int j = i + 1; j < stroka.length; j++) {
                    if (stroka[i] == n[i]) {
                        kek = true;

                    } else {
                        kek = false;
                        break;
                    }
                }
                if (kek == true)
                {
                    break;
                }
            }
        }
        return kek;

    }
    public void probel()
    {
        int ind0 = 0;
        int ind2 = 0;
        int count=0;
        for (int i = 0; i < stroka.length; i++) {
            if (stroka[i]==' ')
            {
                count++;
            }
            else
            {

                ind0 =i;
                break;
            }
        }


        for (int i = stroka.length-1; i>=0; i--) {
            if (stroka[i]==' ')
            {
                count++;
            }
            else
            {
                ind2 =i;
                break;
            }
        }

        int newleng= stroka.length-count;
        char[] buf = new char[newleng];
        int j = 0;
        for (int i = ind0; i <=ind2; i++) {
            while (j <newleng )
            {
                buf[j]=stroka[i];
                j++;
                break;

            }
        }
        stroka=buf;
    }



    public void reverser()
    {
        char[] buff= new char[stroka.length];
        for (int i = 0; i <stroka.length; i++) {
            buff[i]=stroka[i];
        }
        for (int i = 0; i <stroka.length; i++) {
            stroka[i]=buff[stroka.length-1-i];
        }
    }




}
