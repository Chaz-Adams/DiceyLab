public enum Faces {
    FOUR(4), SIX(6), EIGHT(8), TEN(10), TWELVE(12), TWENTY(20);

    private int faces;
    Faces (int numFaces) {
        this.faces = numFaces;
    }

    public int getFaces() {
        return faces;
    }
}
