package String;

public class RomanToInt {
    public static int romanToInt(String s) {
        int nums[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1])
                sum -= nums[i];
            else
                sum += nums[i];
        }
        return sum + nums[nums.length - 1];
    }

//     public int romanToInt(String s) {
//         if(s==null || s.length() == 0){return 0;}
//         HashMap<Character, Integer> map = new HashMap<>();
//         map.put('I',1);
//         map.put('V',5);
//         map.put('X', 10);
//         map.put('L',50);
//         map.put('C',100);
//         map.put('D', 500);
//         map.put('M',1000);
//         int num = 0;
//         num += map.get(s.charAt(0));
//         for(int i=1;i<s.length();i++){
//             if(map.get(s.charAt(i)) <= map.get(s.charAt(i-1))){
//                 num += map.get(s.charAt(i));
//             }else{
//                 num = num - 2*map.get(s.charAt(i-1)) + map.get(s.charAt(i));
//             }
//         }
//         return num;
//     }

    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }
}