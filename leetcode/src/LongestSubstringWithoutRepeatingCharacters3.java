import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters3 {

    public static void main(String[] args) {

        System.out.println(solution("dvdf fdsa"));

    }

// 문제풀이 시도3. -해결 다른 정답코드들을 보니 많이 좋진 않음...
    public static int solution(String s) {

        if (s.isEmpty() ) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        } else {

            List<String> substrings = new ArrayList();


            char[] chars = s.toCharArray();

            List<String> char_substring = new LinkedList<>();

            System.out.println(Arrays.toString(chars));

            int cnt = 0;

            for (char c : chars) {
                cnt++;

                String c_string = Character.toString(c);

//                    System.out.println(c);

                // 문자가 substring에 이미 있으면 수행한다.
                if (char_substring.contains(c_string)) {

                    substrings.add(String.join("", char_substring.toArray(new String[0])));

                    int dup_index = char_substring.indexOf(c_string);

                    System.out.println(dup_index);
                    Iterator iterator = char_substring.iterator();

                    while (iterator.hasNext()) {

                        String ch = (String) iterator.next();

                        // 제일 앞부터 제거해면서 동일한 문자가 있는 위치가 오면 제거하고 반복문을 나온다.
                        if (ch.equals(c_string)) {
                            iterator.remove();
                            break;
                        }
                        iterator.remove();
                    }
                // 문자열의 마지막 문자에서 이 코드가 수행된다.
                } else if (cnt == s.length()) {
                    char_substring.add(c_string);
                    substrings.add(String.join("", char_substring.toArray(new String[0])));
                }

                // 문자가 char_substring에 있는지 검사한 후에 현재 문자를 추가한다.
                char_substring.add(c_string);

            }

            System.out.println(substrings);

            Iterator iterator = substrings.iterator();

            int result = 0;

            while (iterator.hasNext()) {

                int len = ((String) iterator.next()).length();

                result = ( len > result) ? len : result;

            }

            System.out.println(result);

            return 0;
        }

    }


//  문제풀이 시도2
//    public static int solution(String s) {
//
//        if (s.length() == 0 ) {
//            return 0;
//        } else if (s.length() == 1) {
//            return 1;
//        } else {
//            String words[] = s.split(" ");
//
//            int char_cnt = 0;
//
//            List<String> substrings = new ArrayList();
//
//            for (String word : words) {
//
//                char chars[] = word.toCharArray();
//
//                List<String> char_substring = new LinkedList<>();
//
//                System.out.println(Arrays.toString(chars));
//
//                int cnt = 0;
//
//                for (char c : chars) {
//                    cnt++;
//
//                    String c_string = Character.toString(c);
//
////                    System.out.println(c);
//
//                    // 문자가 substring에 이미 있으면 수행한다.
//                    if (char_substring.contains(c_string)) {
//
//                        substrings.add(String.join("", char_substring.toArray(new String[0])));
//
//                        int dup_index = char_substring.indexOf(c_string);
//
//                        System.out.println(dup_index);
//                        Iterator iterator = char_substring.iterator();
//
//                        while (iterator.hasNext()) {
//
//                            String ch = (String) iterator.next();
//
//                            // 제일 앞부터 제거해면서 동일한 문자가 있는 위치가 오면 제거하고 반복문을 나온다.
//                            if (ch.equals(c_string)) {
//                                iterator.remove();
//                                break;
//                            }
//                            iterator.remove();
//                        }
//                    // 문자열의 마지막 문자에서 이 코드가 수행된다.
//                    } else if (cnt == word.length()) {
//                        char_substring.add(c_string);
//                        substrings.add(String.join("", char_substring.toArray(new String[0])));
//                    }
//
//                    // 문자가 char_substring에 있는지 검사한 후에 현재 문자를 추가한다.
//                    char_substring.add(c_string);
//
//                }
//
//
//
//            }
//
//            System.out.println(substrings.toString());
//
//            Iterator iterator = substrings.iterator();
//
//            int result = 0;
//
//            while (iterator.hasNext()) {
//
//                int len = ((String) iterator.next()).length();
//
//                result = ( len > result) ? len : result;
//
//            }
//
//            System.out.println(result);
//
//            return 0;
//        }
//
//    }

//  문제풀이 시도 1.
//    map으로 풀려고 했는데, substring에 대한 개념을 몰랐다.
//    public static int solution(String s) {
//
//        // 회고: 1. substring의 개념을 몰랐다.
//        //      2. 문자열이나 컬렉션에 관한 문제에서 길이를 가지고 다뤄야 하는 문제에서,
//        //      길이가 0, 1, 2 이상 인 경우를 제대로 떠올리지 못했기 때문에 이런 문제상황에서
//        //      문제해결 논리는 제대로 생각하는 연습이 더 필요한 것 같다.
//        //      3. for 문이 모든 요소를 탐색하는지 제대로 인식하고 확인해보고,
//        //      탐색하지 않는 요소가 있다면, 어떻게 해야 재대로 탐색해서 수행할 수 있을지 더 고민해야 한다.
//
//        char[] chars = s.toCharArray();
//
//        Map map = new HashMap<>();
//        List<String> substrings = new ArrayList<String>();
//
////        System.out.println(s.length());
//
//        int count = 0;
//        // 주워진 문자열의 길이가 1보다 크면 밑의 코드가 의도대도 동작하지 않는 걸 확인했다.
//        for (char c  : chars) {
//            count++;
//
//            if (map.get(c) == null || ) {
//                map.put(c, 0);
//                if(s.length() != count) {
//                    continue;
//                }
//            }
//
//            // 마지막 문자때 밑의 코드가 실행되지 않는 문제가 있었다.
//            // 문자열에 중복된 문자가 없으면 마지막까지 넘어가 이 밑으로 실행이 되지 않는다..
//            // 탐색한 문자의 숫자를 계산해서
//            // 위의 조건문 안에 마지막 문자열이면 종료되지 않는 제어문을 추가했다.
//
//
//            String ch[] = Arrays.stream(map.keySet().toArray()).map(Object::toString).toArray(String[]::new);
//
//            String substring = String.join("", ch);
//
////            System.out.println(substring.length());
////            System.out.println(ch.length);
//
//            substrings.add(substring);
//            System.out.println(map.toString());
//
//            map = new HashMap<>();
//            map.put(c, 0);
//
//        }
//
//
//        Stream<String> stream = substrings.stream();
//
//        String result = "";
//        result = stream.reduce(result, (x, y) -> (x.length() < y.length()) ? y : x);
//
//        System.out.println(result);
//
//        // for 문이 제대로 동작할지 않았을 경우에도 문자열의 길이를 리턴하는 코드를 추가해서 완성했다.
////        if (s.length() == 1){
////            return 1;
////        } else if (s.length() == 0) {
////            return 0;
////        }
//
//        return result.length();
//    }

}
