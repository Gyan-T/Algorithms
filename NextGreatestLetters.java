public class NextGreatestLetters {
    public static void main(String[] args) {
        char[] letters = {'b','b','b','b','b','b','b','b','b','b','b','b','b', 'd', 'g', 'm'};
        char target = 'b';
        System.out.println(nextGreatestLetter(letters, target));

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target>letters[letters.length-1]||target==letters[letters.length-1]||target<letters[0])
            return letters[0];
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target<letters[mid]){
                end=mid-1;
            }
            else start=mid+1;
        }
        return letters[start];
    }
}
