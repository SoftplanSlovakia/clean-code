package java;

import java.util.Arrays;

public class GildedRose {

	private Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public static void main(String[] args) {

		Item[] items = new Item[] {
				new Item("Default Item", 10, 20)
		};

		GildedRose app = new GildedRose(items);

		app.updateQuality();

		System.out.println(app);

	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			if (items[i].name != "Aged Brie" && items[i].name != "Backstage passes to a Metallica concert") {
				if (items[i].quality > 0) {
					if (items[i].name != "Sulfuras, Hand of Ragnaros") {
						items[i].quality = items[i].quality - 1;
					}
				}
			} else {
				if (items[i].quality < 50) {
					items[i].quality = items[i].quality + 1;

					if (items[i].name == "Backstage passes to a Metallica concert") {
						if (items[i].sellIn < 11) {
							if (items[i].quality < 50) {
								items[i].quality = items[i].quality + 1;
							}
						}

						if (items[i].sellIn < 6) {
							if (items[i].quality < 50) {
								items[i].quality = items[i].quality + 1;
							}
						}
					}
				}
			}

			if (items[i].name != "Sulfuras, Hand of Ragnaros") {
				items[i].sellIn = items[i].sellIn - 1;
			}

			if (items[i].sellIn < 0) {
				if (items[i].name != "Aged Brie") {

					if (items[i].name != "Backstage passes to a Metallica concert") {
						if (items[i].quality > 0) {
							if (items[i].name != "Sulfuras, Hand of Ragnaros") {
								items[i].quality = items[i].quality - 1;
							}
						}
					} else {
						items[i].quality = 0;
					}
				} else {
					if (items[i].quality < 50) {
						items[i].quality = items[i].quality + 1;
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}

}
