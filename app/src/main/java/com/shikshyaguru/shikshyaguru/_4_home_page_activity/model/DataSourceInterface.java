package com.shikshyaguru.shikshyaguru._4_home_page_activity.model;

import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.List;

/**
 * Created by cricpunk on 8/30/17.
 * Pankaj Koirala
 * Kathmandu Nepal
 *
 *
 * This is similar to a contract between classes that dictate how they can talk to each other.
 * without giving implementation details
 */

public interface DataSourceInterface {

    // Get details of candidates for home page slider
    FirebaseRecyclerOptions<HomePageSliderListItem> getSponsorDetail();

    // Get details of candidates for home page slider
    FirebaseRecyclerOptions<NewsListItem> getNewsDetails();

    // Get list of Colleges details
    FirebaseRecyclerOptions<CollegeListItem> getListOfCollegesData();

    // Get list of Schools details
    FirebaseRecyclerOptions<SchoolsListItem> getListOfSchoolsData();

    // Get list of Universities details
    FirebaseRecyclerOptions<UniversitiesListItem> getListOfUniversitiesData();

    // Get list of Institutes details
    FirebaseRecyclerOptions<InstitutesListItem> getListOfInstitutesData();

    // Get list of Consultancies details
    FirebaseRecyclerOptions<ConsultanciesListItem> getListOfConsultanciesData();

    // Get list of Abroad Study details
    FirebaseRecyclerOptions<AbroadStudyListItem> getListOfAbroadStudyData();

    List<ListOfTotalInstitutions> getTotalInstitutionsHeading();

    //Get list of Drawer main header
    List<DrawerListItem> getListOfDrawerMainHeader();

    //Get list of Home Page Options name
    List<HomePageOptionsListItem> getListOfOptions();

    UserData getUserData();

    String getSlogan(String id);

}
