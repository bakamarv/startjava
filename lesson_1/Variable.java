public class Variable {
    public static void main (String[] args) {
        int vRAM = 4;
        short vCPUCore = 2;
        long vTPD = 28;
        float vCPUSpeed = 2.8f;
        double vMaxCPUSpeed = 3.3;
        char vTreadsNumber = '4';
        boolean vSecureKey = true;

        System.out.println("Установленная память "+ vRAM +" GB");
        System.out.println("Количество ядер процессора " + vCPUCore);
        System.out.println("Расчетная мощность " + vTPD + " W");
        System.out.println("Базовая частота процессора " + vCPUSpeed + " GHz");
        System.out.println("Максимальная тактовая частота " + vMaxCPUSpeed + " GHz");
        System.out.println("Количество потоков " + vTreadsNumber);
        System.out.println("Наличие Sekure Key " + vSecureKey);
    }
}
