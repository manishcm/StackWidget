/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.stackwidget;

import java.io.File;

public class WidgetItem {
    public String text;
    public String title;
    public String link;
    public String url;

    public WidgetItem(String text, String link, String url) {
        this.text = text;
        this.title = text;
        this.link = link;
        this.url = url;
    }
    
    String getTitle() {
    	return title;
    }
    
    String getLinkAbstract() {
    	return link;
    }
    
    String getCoverImageUrl() {
    	return "https://hemoclo.com/hemocloapp/images/hemoclo_shortcut.png";
    	//return "/sdcard/1.jpg";
    }
}
