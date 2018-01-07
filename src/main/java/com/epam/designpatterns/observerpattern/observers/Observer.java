package com.epam.designpatterns.observerpattern.observers;

import com.epam.designpatterns.observerpattern.subjects.Subject;

public interface Observer {

    void update(Subject subject);
}
