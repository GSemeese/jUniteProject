package stubbing;

public class SoundBoard {

    private Soundable noiseMaker;

    public SoundBoard(Soundable noiseMaker) {
        this.noiseMaker = noiseMaker;
    }

    public String letTheNoiseMakerSing() {
        return this.noiseMaker.sing();
    }

    public String letTheNoiseMakerTalk() {
        return this.noiseMaker.talk();
    }
}
