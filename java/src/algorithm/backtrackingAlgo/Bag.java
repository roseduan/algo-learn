package algorithm.backtrackingAlgo;

public class Bag {
	private int result = Integer.MIN_VALUE;

	/**
	 * @param i 装到第几个物品了
	 * @param items 物品的重量数组
	 * @param cw 已经装进袋子的重量
	 * @param w 袋子能装的最大的重量
	 */
	private void loadIntoBag(int i, int[] items, int cw, int w) {
		//重量已经达到最大值，或者已经到最后一个物品
		if (cw == w || i == items.length) {
			if (cw > result) {
				result = cw;
			}
			return;
		}

		//不装进背包
		loadIntoBag(i + 1, items, cw, w);
		//装进背包
		if (cw + items[i] <= w) {
			loadIntoBag(i + 1, items, cw + items[i], w);
		}
	}
}
