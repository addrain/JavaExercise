//URLify: Write a method to replace all spaces in a string with '%20'.  You are given true length of string

class p3 {
    public static String urlify(char[] charArr, int trueLength) {
        int index = trueLength-1;
        for(int i = charArr.length-1; i > 0; i--){
            if(index == i) break;
            if(charArr[index] != ' ') {
                charArr[i] = charArr[index];
                index--;
            } else {
                charArr[i] = '0';
                charArr[--i] = '2';
                charArr[--i] = '%';
                index--;
            }
        }

        return String.valueOf(charArr);
    }
    public static void main(String args[]) {
        String str = "Mr John Smith    ";
        char charArr[] = str.toCharArray();
        int trueLength = 13;

        System.out.println(urlify(charArr, trueLength));

    }
}