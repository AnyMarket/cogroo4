package br.ccsl.cogroo.text;

import java.util.List;

public class Document {
  
  private String text;
  private List<Sentence> sentences;

  
  
  
  
  
  
  
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public List<Sentence> getSentences() {
    return sentences;
  }

  public void setSentences(List<Sentence> sentences) {
    this.sentences = sentences;
  }
  
  
  
  
}
