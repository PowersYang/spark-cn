module.exports = {
  head: [
    ['link', { rel: 'shortcut icon', href: 'http://spark.apache.org/favicon.ico', type: 'image/png' }]
  ],
  locales: {
    '/': {
      lang: 'zh-CN',
      title: 'Spark中文网',
      description: 'Apache Spark™是用于大规模数据处理的统一分析引擎'
    },
    '/en/': {
      lang: 'en-US',
      title: 'Spark Chinese Website',
      description: 'Apache Spark™ is a unified analytics engine for large-scale data processing'
    }
  },

  themeConfig: {
    logo: '/spark-logo-trademark.png',
    repo: 'Y-sir/Spark-cn',
    editLinks: true,
    docsDir: 'docs',
    smoothScroll: true,
    locales: {
      '/': {
        sidebar: require('./sidebar/zh')(),
        lastUpdated: '最后更新',
        selectText: '选择语言',
        label: '简体中文',
        editLinkText: '在 GitHub 上编辑此页',
        nav: [
          { text: '首页', link: '/' },
          { text: '下载安装', link: '/releases/download' },
          {
            text: '官方库',
            items: [
              {text: 'Sql和DadaFrames', link: '/libraries/sql'},
              {text: 'Spark Streaming', link: '/libraries/streaming'},
              {text: 'MLlib(机器学习)', link: '/libraries/mllib'},
              {text: 'GraphX(图)', link: '/libraries/graphx'},
              {text: '第三方项目', link: '/libraries/third-party-projects'},
            ]
          },
          { text: '官方文档', link: '/docs/' },
          { text: '官方示例', link: '/examples/'},
          {
            text: '官方社区 ',
            items: [
              {text: 'Mailing Lists & 资源', link: '/community/community'},
              {text: '为Spark贡献', link: '/community/contributing'},
              {text: '改善建议 (SPIP)', link: '/community/improvement-proposals'},
              {text: '问题追踪', link: 'https://issues.apache.org/jira/browse/SPARK'},
              {text: '技术支持', link: '/community/powered-by'},
              {text: '项目贡献者', link: '/community/committers'},
              {text: '项目历史', link: '/community/history'}
            ]
          },
          {
            text: '开发者',
            items: [
              {text: '实用工具', link: '/developers/developer-tools'},
              {text: '版本真个', link: '/developers/versioning-policy'},
              {text: '发布过程', link: '/developers/release-process'},
              {text: '安全', link: '/developers/security'}            ]
          },
          { text: '优质资源', link: '/docs/awesome/' },
          { text: '关于', link: '/about/' }
        ],
      },
      '/en/': {
        sidebar: require('./sidebar/en')(),
        lastUpdated: 'Last Updated',
        selectText: 'Languages',
        label: 'English',
        editLinkText: 'Edit this page on GitHub',
        nav: [
          { text: 'Home', link: '/' },
          { text: 'Download', link: '/releases/download' },
          {
            text: 'Libraries',
            items: [
              {text: 'Sql and DadaFrames', link: '/libraries/sql'},
              {text: 'Spark Streaming', link: '/libraries/streaming'},
              {text: 'MLlib(machine learning)', link: '/libraries/mllib'},
              {text: 'GraphX(graph)', link: '/libraries/graphx'},
              {text: 'Third-Party Project', link: '/libraries/third-party-projects'},
            ]
          },
          { text: 'Documentation', link: '/docs/' },
          { text: 'Examples', link: '/examples/'},
          {
            text: 'Community ',
            items: [
              {text: 'Mailing Lists & Resources', link: '/community/community'},
              {text: 'Contributing to Spark', link: '/community/contributing'},
              {text: 'Improvement Proposals (SPIP)', link: '/community/improvement-proposals'},
              {text: 'Issue Tracker', link: 'https://issues.apache.org/jira/browse/SPARK'},
              {text: 'Powered By', link: '/community/powered-by'},
              {text: 'Project Committers', link: '/community/committers'},
              {text: 'Project History', link: '/community/history'}
            ]
          },
          {
            text: 'Developers',
            items: [
              {text: 'Useful Developer Tools', link: '/developers/developer-tools'},
              {text: 'Versioning Policy', link: '/developers/versioning-policy'},
              {text: 'Release Process', link: '/developers/release-process'},
              {text: 'Security', link: '/developers/security'}            ]
          },
          { text: 'Awesome', link: '/docs/awesome/' },
          { text: 'About', link: '/about/' }
        ],
      }
    }
  },

  plugins: [
    '@vuepress/back-to-top',
    '@vuepress/nprogress'
  ]
}
