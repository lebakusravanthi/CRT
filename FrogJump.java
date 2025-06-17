import java.util.*;
public class FrogJump {
    Map<Integer, Set<Integer>> stoneMap = new HashMap<>();
    public boolean canCross(int[] stones) {
        for (int stone : stones)
            stoneMap.put(stone, new HashSet<>());
        stoneMap.get(0).add(0);
        for (int stone : stones) {
            for (int k : stoneMap.get(stone)) {
                for (int jump = k - 1; jump <= k + 1; jump++) {
                    if (jump > 0 && stoneMap.containsKey(stone + jump)) {
                        stoneMap.get(stone + jump).add(jump);
                    }
                }
            }
        }
        return !stoneMap.get(stones[stones.length - 1]).isEmpty();
    }
}