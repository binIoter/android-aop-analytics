/*
 * Copyright 2015 - 2016 Egor Andreevici
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package me.egorand.cats.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImgurTag {

    private String name;
    private List<ImgurGalleryItem> items;

    public ImgurTag(String name, List<ImgurGalleryItem> items) {
        this.name = name;
        this.items = new ArrayList<>(items);
    }

    public String getName() {
        return name;
    }

    public List<ImgurGalleryItem> getItems() {
        return Collections.unmodifiableList(items);
    }
}
