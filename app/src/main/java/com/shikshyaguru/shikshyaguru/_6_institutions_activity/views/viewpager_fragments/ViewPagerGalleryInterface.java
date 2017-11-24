package com.shikshyaguru.shikshyaguru._6_institutions_activity.views.viewpager_fragments;

import com.shikshyaguru.shikshyaguru._6_institutions_activity.model.InstitutionGalleryData;

/**
 * Project Name => ShikshyaGuru
 * Created by   => Pankaj Koirala
 * Created on   => 2:31 PM 15 Nov 2017
 * Email Id     => koiralapankaj007@gmail.com
 */

public interface ViewPagerGalleryInterface {

    void setUpGalleryCategory(InstitutionGalleryData galleryData);

    void onGalleryCategoryClick(String category);

}
