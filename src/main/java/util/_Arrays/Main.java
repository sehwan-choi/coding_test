package util._Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 문제 url <a href=""></a>
 *
 */
public class Main {
    public static void main(String[] args) throws Exception {

        // 리스트 오름차순 정렬
        int arr[] = {1,6,4,2,8,5};

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(x -> System.out.println("x = " + x));
        System.out.println();
        // {1,2,4,5,6,8}


        // 리스트 역순 정렬
        int arr2[] = {1,2,3,4,5};
        Integer[] integers = IntStream.of(arr2).boxed().toArray(Integer[]::new);

        Arrays.sort(integers, Collections.reverseOrder());
        Arrays.stream(arr2).forEach(x -> System.out.println("x = " + x));
        System.out.println();

        //중복없이 값을 넣고 싶을때
        int arr3[] = {1,1,2,2,3,3,4,4,5,5};
        ArrayList<Integer> lists = new ArrayList<>();

        for (int i = 0 ; i < arr3.length ; i++) {
            if (!lists.contains(arr3[i])) {
                lists.add(arr3[i]);
            }
        }
        System.out.println("lists = " + lists);

    }
}
