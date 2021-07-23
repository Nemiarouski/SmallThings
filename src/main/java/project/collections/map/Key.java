package project.collections.map;

import java.util.Objects;

public class Key {
    private Integer id;
    private String serialWord;

    public Key() {
    }
    public Key(Integer id, String serialWord) {
        this.id = id;
        this.serialWord = serialWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerialWord() {
        return serialWord;
    }

    public void setSerialWord(String serialWord) {
        this.serialWord = serialWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return id == key.id && serialWord.equals(key.serialWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serialWord);
    }

    @Override
    public String toString() {
        return "Key{" +
                "id=" + id +
                ", serialWord='" + serialWord + '\'' +
                '}';
    }
}