package animal;


public class Human extends Animal implements Thinkable {

    // mainメソッド不要。趣味の情報を補完するフィールドをカプセル化
    private String hobby;    // 趣味


    // String型引数2つ、int型引数1つがあるコンストラクタ
    public Human (String name, int age, String hobby) {
        // 名前と年齢の初期化についてはスーパークラス（Animal)のコンストラクタを利用
        super (name,age);
        this.hobby = hobby;
    }


    //thinkメソッド
    @Override
    public void think () {
        // 私は□□について考えています。と表示する。
        System.out.println("私は" + hobby + "について考えています。");
    }
}

