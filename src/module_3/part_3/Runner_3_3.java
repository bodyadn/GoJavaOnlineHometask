package module_3.part_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Runner_3_3 {

    public static void main(String[] args) {

        //делаем новый магазин
        MusicShop musicShop = new MusicShop();

        // наполняем магазин инстументами
        for (int i = 0; i < 4; i++) {
            musicShop.getPianos().add(new Piano());
            musicShop.getGuitars().add(new Guitar());
            musicShop.getTrumpets().add(new Trumpet());
        }

        //выводим состояние до заказа
        System.out.println(musicShop.getPianos().toString() +
                musicShop.getGuitars().toString() +
                musicShop.getTrumpets().toString());

        //формируем заказ для отгрузки
        Map<String, Integer> order = new HashMap<>();
        order.put("piano", 1);
        order.put("guitar", 2);
        order.put("trumpet", 3);

        Set<String> keysOrderSet = order.keySet();

        for (String key : keysOrderSet) {

            //генерируем исключение, если ключ в заказе не соответствует "piano", "guitar" или "trumpet"
            try {
                if (!key.equals("piano") && !key.equals("guitar") && !key.equals("trumpet"))
                    throw new UnproperKeyOrderException();
            } catch (UnproperKeyOrderException e) {
                System.out.println("Order not equals 'piano' or 'guitar' or 'trumpet'");
            }

            //генерируем стандартное исключение, если количество в заказе больше, чем текущий остаток или <= 0
            if (((!key.equals("piano") || order.get(key) > musicShop.getPianos().size() || order.get(key) <= 0)) &&
                    ((!key.equals("guitar") || order.get(key) > musicShop.getGuitars().size() || order.get(key) <= 0)) &&
                    ((!key.equals("trumpet") || order.get(key) > musicShop.getTrumpets().size() || order.get(key) <= 0))) {
                throw new IllegalStateException();
            }

            // уменьшаем остатки магазина согласно поступившего заказа (почему не работает если заказ изменить на 3?)
            for (int i = order.get(key)-1; i >= 0 ; i--) {
                switch (key) {
                    case "piano":
                        musicShop.getPianos().remove(i);
                        break;
                    case "guitar":
                        musicShop.getGuitars().remove(i);
                        break;
                    case "trumpet":
                        musicShop.getTrumpets().remove(i);
                        break;
                }
            }
        }

        //выводим состояние после заказа
        System.out.println(musicShop.getPianos().toString() +
                musicShop.getGuitars().toString() +
                musicShop.getTrumpets().toString());

    }
}
