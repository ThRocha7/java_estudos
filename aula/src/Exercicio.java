public class Exercicio {
    public static void exercicio1(String[] args){
        // exercicio 1;
        int[] nums = new int[50];

        for(int i = 0; i < nums.length; i++){
            nums[i] = (i + 5 * i) % (i + 1);
        }
        
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        // exercicio 2;
        
    }
}
