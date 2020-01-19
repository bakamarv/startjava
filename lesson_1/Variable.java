public class Variable {
    public static void main(String[] args) {
        int ram = 4;
        short cpuCore = 2;
        long tpd = 28;
        float cpuSpeed = 2.8f;
        double maxCPUSpeed = 3.3;
        char treadsNumber = '4';
        boolean isSecureKey = true;

        System.out.println("Установленная память "+ ram +" GB");
        System.out.println("Количество ядер процессора " + cpuCore);
        System.out.println("Расчетная мощность " + tpd + " W");
        System.out.println("Базовая частота процессора " + cpuSpeed + " GHz");
        System.out.println("Максимальная тактовая частота " + maxCPUSpeed + " GHz");
        System.out.println("Количество потоков " + treadsNumber);
        System.out.println("Наличие Sekure Key " + isSecureKey);
    }
}
