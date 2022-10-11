// Generated by Dagger (https://dagger.dev).
package com.yzdev.mobiletest.data;

import com.yzdev.mobiletest.dataSource.RestDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoticeRepositoryImp_Factory implements Factory<NoticeRepositoryImp> {
  private final Provider<RestDataSource> dataSourceProvider;

  public NoticeRepositoryImp_Factory(Provider<RestDataSource> dataSourceProvider) {
    this.dataSourceProvider = dataSourceProvider;
  }

  @Override
  public NoticeRepositoryImp get() {
    return newInstance(dataSourceProvider.get());
  }

  public static NoticeRepositoryImp_Factory create(Provider<RestDataSource> dataSourceProvider) {
    return new NoticeRepositoryImp_Factory(dataSourceProvider);
  }

  public static NoticeRepositoryImp newInstance(RestDataSource dataSource) {
    return new NoticeRepositoryImp(dataSource);
  }
}
