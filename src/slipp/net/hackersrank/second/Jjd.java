package slipp.net.hackersrank.second;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Ru4ng
 * Date: 2016-02-15
 * Time: 오후 9:16
 */
public class Jjd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		Map map = new HashMap();
		final int initialCount = 1;
		int maxUniqueNubmers = 0;
		List uniqueNumbers = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			if(!map.containsKey(num)) {
				map.put(num, initialCount);
			} else {
				int count = (int)map.get(num) + 1;
				map.put(num, count);
			}
			if(i+1 == m) {
				maxUniqueNubmers = maxUniqueNubmers < map.size() ? map.size() : maxUniqueNubmers;
			} else if(i+1 > m) {
				int firstNum = (int)deque.peekFirst();
				deque.pollFirst();
				int firstNumCount = (int)map.get(firstNum);
				if(firstNumCount > 1) {
					map.put(firstNum, firstNumCount-1);
				} else {
					map.remove(firstNum);
				}
				maxUniqueNubmers = maxUniqueNubmers < map.size() ? map.size() : maxUniqueNubmers;
			}
		}
		System.out.print(n==m? map.size() : maxUniqueNubmers);
	}
}
