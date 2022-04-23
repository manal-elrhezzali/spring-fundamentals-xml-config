package com.manal.service;

import com.manal.model.Speaker;
import com.manal.repository.SpeakerRepository;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService{

  private SpeakerRepository repository;

  public List<Speaker> findAll() {
    return repository.findAll();
  }

  //added this constructor for constructor injection
  public SpeakerServiceImpl(SpeakerRepository repository) {
    this.repository = repository;
  }

  public SpeakerServiceImpl() {
  }

  public void setSpeakerRepository(SpeakerRepository repository) {
    this.repository = repository;
  }
}
