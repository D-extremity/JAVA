/*
 * LEET CODE QUESTION NUMBER 2418
 */

package ExtraStuff;
public class SortThePeopleLeet{
public String[] sortPeople( String names[],int[] heights) {
        int len = heights.length - 1;
        if (names.length - 1 != len)
            return names;
       return mergeDivide(heights, names, 0, len);
    }

    public String[] mergeDivide(int heights[], String names[], int start, int end) {
        if (start >= end)
            return names;

        int mid = start + (end - start) / 2;
        mergeDivide(heights, names, start, mid);
        mergeDivide(heights, names, mid + 1, end);
       return mergeConquer(heights, names, start, mid, end);
    }

    public String[] mergeConquer(int heights[], String name[], int start, int mid, int end) {
        int firstIndex = start;
        int secondIndex = mid + 1;
        int newArrayIndex = 0;
        String newName[] = new String[end - start + 1];
        int newHeight[] = new int[end - start + 1];
        while (firstIndex <= mid && secondIndex <= end) {
            if (heights[firstIndex] > heights[secondIndex]) {
                newHeight[newArrayIndex] = heights[firstIndex];

                newName[newArrayIndex++] = name[firstIndex++];
            } else {
                newHeight[newArrayIndex] = heights[secondIndex];

                newName[newArrayIndex++] = name[secondIndex++];
            }
        }
        while (firstIndex <= mid) {
            newHeight[newArrayIndex] = heights[firstIndex];

            newName[newArrayIndex++] = name[firstIndex++];
        }
        while (secondIndex <= end) {
            newHeight[newArrayIndex] = heights[secondIndex];

            newName[newArrayIndex++] = name[secondIndex++];
        }
        for (int i = 0, j = start; i < newName.length; i++, j++) {
            heights[j] = newHeight[i];
            name[j] = newName[i];
        }
        return name;
    }
}