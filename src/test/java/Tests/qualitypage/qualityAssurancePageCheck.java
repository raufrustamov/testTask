package Tests.qualitypage;

import Tests.base.BaseTest;
import org.junit.Test;

import static constant.Constant.QA_CAREERS_PAGE;
import static junit.framework.TestCase.assertFalse;
import static pages.QualityAssurance.*;

public class qualityAssurancePageCheck extends BaseTest {

  @Test

  public void filterJobs() throws InterruptedException {
    basePage.openPage(QA_CAREERS_PAGE);
    qa.clickOnSeeAll()
      .setFilterByLocation();

    assertFalse("Should not be empty: ", qa.attributeExtractor(position).contains(""));
    assertFalse("Should not be empty: ", qa.attributeExtractor(department).contains(""));
    assertFalse("Should not be empty: ", qa.attributeExtractor(jobsLocation).contains(""));
  }
}

