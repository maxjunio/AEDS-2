
public class NewClass {

    public static String verifica(String exp) {
        while (exp.length() > 1) {
            exp = exp.replace("not(0)", "1");
            exp = exp.replace("not(1)", "0");

            exp = exp.replace("or(0,0", "or(0");
            exp = exp.replace("or(0,1", "or(1");
            exp = exp.replace("or(1,0", "or(1");
            exp = exp.replace("or(1,1", "or(1");
            exp = exp.replace("or(1)", "1");
            exp = exp.replace("or(0)", "0");

            exp = exp.replace("and(0,0", "and(0");
            exp = exp.replace("and(0,1", "and(0");
            exp = exp.replace("and(1,0", "and(0");
            exp = exp.replace("and(1,1", "and(1");
            exp = exp.replace("and(1)", "1");
            exp = exp.replace("and(0)", "0");
        }

        return exp;
    }

    public static String verificaBoolean(String exp) {

        if (exp.length() > 1) {

            exp = exp.replace("and(0,0", "and(0");
            exp = exp.replace("and(0,1", "and(0");
            exp = exp.replace("and(1,0", "and(0");
            exp = exp.replace("and(1,1", "and(1");
            exp = exp.replace("and(1)", "1");
            exp = exp.replace("and(0)", "0");

            exp = exp.replace("or(0,0", "or(0");
            exp = exp.replace("or(0,1", "or(1");
            exp = exp.replace("or(1,0", "or(1");
            exp = exp.replace("or(1,1", "or(1");
            exp = exp.replace("or(1)", "1");
            exp = exp.replace("or(0)", "0");

            exp = exp.replace("not(0)", "1");
            exp = exp.replace("not(1)", "0");

            return verificaBoolean(exp);
        } else {
            return exp;
        }

    }

    public static void main(String[] args) {
        int rep = 1;
        int[] num = new int[3];
        String exp;
        while (rep != 0) {
            rep = MyIO.readInt();
            if (rep == 0) {
                break;
            } else {

                for (int i = 0; i < rep; i++) {
                    num[i] = MyIO.readInt();
                }
                exp = MyIO.readLine();

                exp = exp.replace(" ", "");
                exp = exp.replace("A", "" + num[0]);
                exp = exp.replace("B", "" + num[1]);
                exp = exp.replace("C", "" + num[2]);

                MyIO.println(verificaBoolean(exp));
            }
        }

    }
}
