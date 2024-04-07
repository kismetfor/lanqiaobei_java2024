public class MainP31 {
    public static void main(String[] args) {
        int min = 999;
        int optimal = -1;
        for (int i = 1; i <= 100; i++) {
            int x;
            if (100 %i==0) {
                x = 100/i + i;
            } else {
                x = 100/i+1+i;
            }
            if (x < min) {
                min = x;
                optimal = i;
            }
        }
        System.out.println(optimal);
        System.out.println(min);
    }
    public static void main1(String[] args) {
        int population = 1000; // 民众总数
        double infectionRate = 0.01; // 感染率
        int minK = 1;
        int maxK = 10; // 可以尝试的最大k值

        int minBoxes = Integer.MAX_VALUE;
        int optimalK = 1; //最佳结果

        for (int k = minK; k <= maxK; k++) {
            int boxes = calculateBoxes(population, infectionRate, k);
            if (boxes < minBoxes) {
                minBoxes = boxes;
                optimalK = k;
            }
        }

        System.out.println("最优的k值为: " + optimalK);
        System.out.println("最少使用的试剂盒数量为: " + minBoxes);
    }

    private static int calculateBoxes(int population, double infectionRate, int k) {
        int totalBoxes = 0;
        int remainingPopulation = population;

        while (remainingPopulation > 0) {
            int groupSize = Math.min(k, remainingPopulation);
            int groupInfections = (int) Math.ceil(groupSize * infectionRate);

            // 如果该组至少有一个感染者，则需要额外一个试剂盒
            totalBoxes += (groupInfections > 0) ? groupSize + 1 : 1;

            remainingPopulation -= groupSize;
        }

        return totalBoxes;
    }
}
