package jameschristian.pottato.dev.dota2heroes.data;

import java.util.ArrayList;

public class Hero {
  private String name;
  private String biography;
  private int photo;
  private ArrayList<Skills> skills;

  Hero() {
  }

  public ArrayList<Skills> getSkills() {
    return skills;
  }

  public void setSkills(ArrayList<Skills> skills) {
    this.skills = skills;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBiography() {
    return biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }

  public int getPhoto() {
    return photo;
  }

  public void setPhoto(int photo) {
    this.photo = photo;
  }
}
