public class Ex04 {
    public static void main(String[] args) {

        double dRate = Double.parseDouble (args[0]);
        double setup_costs = Double.parseDouble (args[1]);
        double holding_costs = Double.parseDouble (args[2]);

        double EOQ = Math.sqrt ((2 * dRate * setup_costs) / holding_costs);
        double TBO = Math.sqrt ((2 * setup_costs) / dRate * holding_costs);

        System.out.println ("Economic Order Quantity : " + EOQ);
        System.out.println ("Time Between Orders  : " + TBO);
    }
}