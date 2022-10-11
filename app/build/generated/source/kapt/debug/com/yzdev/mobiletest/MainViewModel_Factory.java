// Generated by Dagger (https://dagger.dev).
package com.yzdev.mobiletest;

import com.yzdev.mobiletest.repository.NoticeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<NoticeRepository> noticeRepositoryImpProvider;

  public MainViewModel_Factory(Provider<NoticeRepository> noticeRepositoryImpProvider) {
    this.noticeRepositoryImpProvider = noticeRepositoryImpProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(noticeRepositoryImpProvider.get());
  }

  public static MainViewModel_Factory create(
      Provider<NoticeRepository> noticeRepositoryImpProvider) {
    return new MainViewModel_Factory(noticeRepositoryImpProvider);
  }

  public static MainViewModel newInstance(NoticeRepository noticeRepositoryImp) {
    return new MainViewModel(noticeRepositoryImp);
  }
}
