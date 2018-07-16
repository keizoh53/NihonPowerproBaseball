package com.example;

import com.example.domain.Player;
import com.example.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@ComponentScan
@SpringBootApplication
public class App {
//    @Autowired
//    private PlayerRepository playerRepository;

//    @Override
//    public void run(String... strings) throws Exception {
        //データ追加
//        Player created = playerRepository.save(new Player(null, "建造", "三菱"));
//        System.out.println(created + " is created!");
        //ページング処理
//        org.springframework.data.domain.Pageable pageable = new PageRequest(0, 3);
//        Page<Player> page = playerRepository.findAll(pageable);
//        System.out.println("１ページあたりのデータ数 = " + page.getSize());
//        System.out.println("現在のページ = " + page.getNumber());
//        System.out.println("全ページ数 = " + page.getTotalPages());
//        System.out.println("全データ数 = " + page.getTotalElements());
//        page.getContent().forEach(System.out::println);
//    }

    //    @Autowired
//    PlayerService playerService;
//
//    @Override
//    public void run(String... strings) throws Exception {
    //データ追加
//        playerService.save(new Player(1, "啓太", "深川", 25,
//                8, "1992/04/22",  new HashMap<>() {{
//            put("湾岸島ウェーブス", "2010~");
//        }}, null, 44,
//                true, "外野手", new ArrayList<>() {{
//                    add("一塁手");
//        }}, "right",
//                "right", new Ability(null, new FielderAbility(3,
//                55, 55, 55, 55, 55, 55, null))));
//        playerService.save(new Player(2, "耕平", "黒羽", 25,
//                8, "1992/12/06", new HashMap<>() {{
//            put("湾岸島ウェーブス", "2010~");
//        }}, null,
//                18, true, "投手", null, "right",
//                "right", null));
//        playerService.save(new Player(3, null, null, null,
//                null, null, null, null, null,
//                null, null, null, null, null,
//                null));
//
    //データ表示
//        playerService.findAll().forEach(System.out::println);
//    }
//
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
