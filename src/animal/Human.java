package animal;

// mainメソッド不要

// Animalクラスを継承し、Thinkableインターフェースを実装する
public class Human extends Animal implements Thinkable {

    // 趣味の情報を補完するフィールドを定義する(カプセル化の使用)
    private String hobby;    // 趣味


    // String型引数2つ、int型引数1つがあるコンストラクタ
    public Human (String name, int age, String hobby) {
        // 名前と年齢の初期化についてはスーパークラス（Animal)のコンストラクタを利用
        super (name,age);
        this.hobby = hobby;
    }


    //thinkメソッドを実装
    @Override
    public void think () {
        // 私は□□について考えています。と画面に System.out.println() で表示する。
        System.out.println("私は" + hobby + "について考えています。");
    }
}

