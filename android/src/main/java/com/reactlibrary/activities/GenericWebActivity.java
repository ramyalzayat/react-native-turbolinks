package com.reactlibrary.activities;

import com.basecamp.turbolinks.TurbolinksAdapter;
import com.basecamp.turbolinks.TurbolinksView;

public interface GenericWebActivity extends GenericActivity, TurbolinksAdapter {

    TurbolinksView getTurbolinksView();

    String getMessageHandler();

    String getUserAgent();

    void reloadSession();

    void visitTurbolinksView(TurbolinksView turbolinksView, String url);

    void postMessage(String message);

    void setupFileChooser();

}
